package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_484 {
    private final Production34_484 production = new Production34_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}