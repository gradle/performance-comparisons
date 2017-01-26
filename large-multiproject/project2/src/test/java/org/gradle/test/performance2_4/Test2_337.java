package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_337 {
    private final Production2_337 production = new Production2_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}