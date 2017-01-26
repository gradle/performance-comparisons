package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_3 {
    private final Production52_3 production = new Production52_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}