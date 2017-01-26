package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_119 {
    private final Production2_119 production = new Production2_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}