package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_65 {
    private final Production34_65 production = new Production34_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}