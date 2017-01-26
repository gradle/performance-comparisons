package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_187 {
    private final Production34_187 production = new Production34_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}