package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_432 {
    private final Production2_432 production = new Production2_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}