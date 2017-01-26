package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_358 {
    private final Production34_358 production = new Production34_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}