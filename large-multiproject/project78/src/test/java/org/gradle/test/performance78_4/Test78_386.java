package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_386 {
    private final Production78_386 production = new Production78_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}