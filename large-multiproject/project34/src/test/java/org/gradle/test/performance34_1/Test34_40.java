package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_40 {
    private final Production34_40 production = new Production34_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}