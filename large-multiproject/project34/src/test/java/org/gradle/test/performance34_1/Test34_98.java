package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_98 {
    private final Production34_98 production = new Production34_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}