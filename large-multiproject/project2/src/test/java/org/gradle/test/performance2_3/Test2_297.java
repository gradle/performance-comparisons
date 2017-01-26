package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_297 {
    private final Production2_297 production = new Production2_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}