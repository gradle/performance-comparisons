package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_182 {
    private final Production19_182 production = new Production19_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}