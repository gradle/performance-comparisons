package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_173 {
    private final Production34_173 production = new Production34_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}