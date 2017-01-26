package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_181 {
    private final Production34_181 production = new Production34_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}