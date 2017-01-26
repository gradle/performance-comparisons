package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_415 {
    private final Production34_415 production = new Production34_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}