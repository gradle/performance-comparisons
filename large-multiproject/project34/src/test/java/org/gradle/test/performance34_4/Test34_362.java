package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_362 {
    private final Production34_362 production = new Production34_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}