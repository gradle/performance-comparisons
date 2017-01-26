package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_377 {
    private final Production78_377 production = new Production78_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}