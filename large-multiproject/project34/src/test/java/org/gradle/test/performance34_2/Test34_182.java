package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_182 {
    private final Production34_182 production = new Production34_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}