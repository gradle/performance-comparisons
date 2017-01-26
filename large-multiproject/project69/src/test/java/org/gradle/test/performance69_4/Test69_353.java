package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_353 {
    private final Production69_353 production = new Production69_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}