package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_382 {
    private final Production34_382 production = new Production34_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}