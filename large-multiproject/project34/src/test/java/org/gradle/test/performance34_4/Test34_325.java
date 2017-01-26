package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_325 {
    private final Production34_325 production = new Production34_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}