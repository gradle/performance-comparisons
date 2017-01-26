package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_338 {
    private final Production34_338 production = new Production34_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}