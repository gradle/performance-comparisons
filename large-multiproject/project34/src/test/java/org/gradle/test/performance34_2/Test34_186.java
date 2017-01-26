package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_186 {
    private final Production34_186 production = new Production34_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}