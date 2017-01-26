package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_268 {
    private final Production52_268 production = new Production52_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}