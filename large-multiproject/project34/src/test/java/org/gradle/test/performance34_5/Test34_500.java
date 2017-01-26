package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_500 {
    private final Production34_500 production = new Production34_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}