package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_267 {
    private final Production34_267 production = new Production34_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}