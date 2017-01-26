package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_395 {
    private final Production19_395 production = new Production19_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}