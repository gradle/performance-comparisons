package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_66 {
    private final Production34_66 production = new Production34_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}