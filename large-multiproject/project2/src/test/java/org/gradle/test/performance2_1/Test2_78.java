package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_78 {
    private final Production2_78 production = new Production2_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}