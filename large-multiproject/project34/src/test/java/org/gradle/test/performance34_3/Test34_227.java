package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_227 {
    private final Production34_227 production = new Production34_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}