package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_468 {
    private final Production34_468 production = new Production34_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}