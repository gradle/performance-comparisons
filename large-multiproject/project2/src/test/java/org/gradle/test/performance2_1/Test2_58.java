package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_58 {
    private final Production2_58 production = new Production2_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}