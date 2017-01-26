package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_458 {
    private final Production34_458 production = new Production34_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}