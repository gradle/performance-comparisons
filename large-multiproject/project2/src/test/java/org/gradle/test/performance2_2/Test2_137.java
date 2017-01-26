package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_137 {
    private final Production2_137 production = new Production2_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}