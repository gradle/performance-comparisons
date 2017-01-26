package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_361 {
    private final Production34_361 production = new Production34_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}