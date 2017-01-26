package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_228 {
    private final Production34_228 production = new Production34_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}