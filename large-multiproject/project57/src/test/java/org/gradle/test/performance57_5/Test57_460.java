package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_460 {
    private final Production57_460 production = new Production57_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}