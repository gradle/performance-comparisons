package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_195 {
    private final Production34_195 production = new Production34_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}