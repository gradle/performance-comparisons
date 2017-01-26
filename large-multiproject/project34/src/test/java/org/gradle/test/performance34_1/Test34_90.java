package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_90 {
    private final Production34_90 production = new Production34_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}