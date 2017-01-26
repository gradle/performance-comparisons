package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_61 {
    private final Production2_61 production = new Production2_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}