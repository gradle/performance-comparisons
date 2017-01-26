package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_168 {
    private final Production2_168 production = new Production2_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}