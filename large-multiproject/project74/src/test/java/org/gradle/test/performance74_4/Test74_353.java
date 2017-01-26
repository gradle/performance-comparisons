package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_353 {
    private final Production74_353 production = new Production74_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}