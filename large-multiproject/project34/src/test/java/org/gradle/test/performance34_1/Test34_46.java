package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_46 {
    private final Production34_46 production = new Production34_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}