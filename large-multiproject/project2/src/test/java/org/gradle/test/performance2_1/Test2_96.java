package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_96 {
    private final Production2_96 production = new Production2_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}