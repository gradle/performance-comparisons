package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_162 {
    private final Production34_162 production = new Production34_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}