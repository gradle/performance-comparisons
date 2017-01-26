package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_266 {
    private final Production34_266 production = new Production34_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}