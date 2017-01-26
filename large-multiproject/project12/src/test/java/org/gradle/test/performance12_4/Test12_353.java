package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_353 {
    private final Production12_353 production = new Production12_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}