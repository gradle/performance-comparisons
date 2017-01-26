package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_255 {
    private final Production78_255 production = new Production78_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}