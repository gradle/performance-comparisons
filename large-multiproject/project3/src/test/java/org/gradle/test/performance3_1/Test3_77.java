package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_77 {
    private final Production3_77 production = new Production3_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}