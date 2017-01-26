package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_465 {
    private final Production2_465 production = new Production2_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}