package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_75 {
    private final Production52_75 production = new Production52_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}