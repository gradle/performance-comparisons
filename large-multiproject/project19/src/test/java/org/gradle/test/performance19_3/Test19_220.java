package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_220 {
    private final Production19_220 production = new Production19_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}