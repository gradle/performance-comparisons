package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_395 {
    private final Production34_395 production = new Production34_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}