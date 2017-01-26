package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_167 {
    private final Production2_167 production = new Production2_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}