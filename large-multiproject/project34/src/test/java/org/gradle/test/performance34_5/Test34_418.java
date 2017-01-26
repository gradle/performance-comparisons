package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_418 {
    private final Production34_418 production = new Production34_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}