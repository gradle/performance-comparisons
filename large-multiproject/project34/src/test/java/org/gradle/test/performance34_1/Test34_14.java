package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_14 {
    private final Production34_14 production = new Production34_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}