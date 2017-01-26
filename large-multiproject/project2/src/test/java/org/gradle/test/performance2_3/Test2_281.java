package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_281 {
    private final Production2_281 production = new Production2_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}