package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_150 {
    private final Production34_150 production = new Production34_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}